package chess;

public enum Color {
    WHITE {
        @Override
        public String toString() { return "BRANCO"; }
    },
    BLACK {
        @Override
        public String toString() { return "PRETO"; }
    };
}