package org.example.openclosed;

public class Area {
    // Classe que calcula a soma das áreas de formas geométricas
        private Forma[] formas;

        public Area(Forma[] shapes) {
            this.formas = shapes;
        }

        public double sumAreas() {
            double sum = 0;
            for (Forma forma : formas) {
                sum += forma.calculateArea();
            }
            return sum;
        }

}
