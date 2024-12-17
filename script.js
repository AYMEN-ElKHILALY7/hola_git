document.addEventListener("DOMContentLoaded", () => {
    const tablero = document.getElementById("tablero");

    // Crear el tablero
    function crearTablero() {
        for (let fila = 8; fila >= 1; fila--) {
            for (let col = 0; col < 8; col++) {
                const casilla = document.createElement("div");
                casilla.classList.add("casilla", (fila + col) % 2 === 0 ? "blanco" : "negro");
                casilla.dataset.posicion = String.fromCharCode(65 + col) + fila;
                tablero.appendChild(casilla);
            }
        }
    }

    crearTablero();

    // Lógica de selección de ficha
    const form = document.getElementById("form-ficha");
    const resultado = document.getElementById("movimientos");

    form.addEventListener("submit", (e) => {
        e.preventDefault();

        const tipoFicha = document.getElementById("tipoFicha").value;
        const posicion = document.getElementById("posicion").value.toUpperCase();
        const movimientos = calcularMovimientos(tipoFicha, posicion);

        resultado.textContent = movimientos || "Posición inválida o movimiento no calculado.";
    });

    function calcularMovimientos(tipo, pos) {
        const columnas = "ABCDEFGH";
        const fila = parseInt(pos[1]);
        const col = columnas.indexOf(pos[0]);

        if (col === -1 || fila < 1 || fila > 8) return null;

        let movimientos = [];

        switch (tipo) {
            case "Rey":
                movimientos = [
                    [1, 0], [1, 1], [0, 1], [-1, 1],
                    [-1, 0], [-1, -1], [0, -1], [1, -1]
                ];
                break;
            case "Caballo":
                movimientos = [
                    [2, 1], [2, -1], [-2, 1], [-2, -1],
                    [1, 2], [1, -2], [-1, 2], [-1, -2]
                ];
                break;
            // Otros casos (Dama, Torre, etc.) se agregarán aquí.
        }

        return movimientos.map(m => {
            const nuevaFila = fila + m[0];
            const nuevaCol = col + m[1];
            if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaCol >= 0 && nuevaCol < 8) {
                return columnas[nuevaCol] + nuevaFila;
            }
            return null;
        }).filter(Boolean).join(", ");
    }
});
