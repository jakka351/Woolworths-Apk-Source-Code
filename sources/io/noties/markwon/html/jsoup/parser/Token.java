package io.noties.markwon.html.jsoup.parser;

import YU.a;

/* loaded from: classes7.dex */
public abstract class Token {

    public static final class CData extends Character {
        @Override // io.noties.markwon.html.jsoup.parser.Token.Character
        public final String toString() {
            return a.o(new StringBuilder("<![CDATA["), null, "]]>");
        }
    }

    public static class Character extends Token {
        public String toString() {
            return null;
        }
    }

    public static final class Comment extends Token {
        public final String toString() {
            throw null;
        }
    }

    public static final class Doctype extends Token {
    }

    public static final class EOF extends Token {
    }

    public static final class EndTag extends Tag {
        public final String toString() {
            return "</" + a() + ">";
        }
    }

    public static final class StartTag extends Tag {
        public final String toString() {
            return "<" + a() + ">";
        }
    }

    public static abstract class Tag extends Token {
        public final String a() {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {
        public static final /* synthetic */ TokenType[] d = {new TokenType("Doctype", 0), new TokenType("StartTag", 1), new TokenType("EndTag", 2), new TokenType("Comment", 3), new TokenType("Character", 4), new TokenType("EOF", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        TokenType EF5;

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) d.clone();
        }
    }
}
