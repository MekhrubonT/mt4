class LexerToken<L> {
    private final L type;
    private final String data;

    LexerToken(L type, String data) {
        this.type = type;
        this.data = data;
    }
}
