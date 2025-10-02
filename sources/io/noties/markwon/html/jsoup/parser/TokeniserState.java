package io.noties.markwon.html.jsoup.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
abstract class TokeniserState {
    public static final /* synthetic */ TokeniserState[] d = {new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.1
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.2
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.3
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.4
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.5
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.6
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.7
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.8
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.9
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.10
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.11
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.12
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.13
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.14
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.15
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.16
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.17
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.18
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.19
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.20
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.21
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.22
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.23
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.24
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.25
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.26
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.27
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.28
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.29
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.30
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.31
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.32
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.33
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.34
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.35
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.36
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.37
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.38
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.39
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.40
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.41
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.42
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.43
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.44
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.45
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.46
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.47
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.48
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.49
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.50
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.51
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.52
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.53
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.54
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.55
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.56
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.57
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.58
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.59
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.60
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.61
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.62
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.63
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.64
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.65
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.66
    }, new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.67
    }};

    /* JADX INFO: Fake field, exist only in values array */
    TokeniserState EF2;

    static {
        String.valueOf((char) 65533);
    }

    public static TokeniserState valueOf(String str) {
        return (TokeniserState) Enum.valueOf(TokeniserState.class, str);
    }

    public static TokeniserState[] values() {
        return (TokeniserState[]) d.clone();
    }
}
