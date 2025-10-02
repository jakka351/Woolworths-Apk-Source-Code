package com.apollographql.apollo.api.json;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Token", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonReader extends Closeable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader$Token;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Token {
        public static final Token d;
        public static final Token e;
        public static final Token f;
        public static final Token g;
        public static final Token h;
        public static final Token i;
        public static final Token j;
        public static final Token k;
        public static final Token l;
        public static final Token m;
        public static final Token n;
        public static final Token o;
        public static final /* synthetic */ Token[] p;
        public static final /* synthetic */ EnumEntries q;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            d = token;
            Token token2 = new Token("END_ARRAY", 1);
            e = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            f = token3;
            Token token4 = new Token("END_OBJECT", 3);
            g = token4;
            Token token5 = new Token("NAME", 4);
            h = token5;
            Token token6 = new Token("STRING", 5);
            i = token6;
            Token token7 = new Token("NUMBER", 6);
            j = token7;
            Token token8 = new Token("LONG", 7);
            k = token8;
            Token token9 = new Token("BOOLEAN", 8);
            l = token9;
            Token token10 = new Token("NULL", 9);
            m = token10;
            Token token11 = new Token("END_DOCUMENT", 10);
            n = token11;
            Token token12 = new Token("ANY", 11);
            o = token12;
            Token[] tokenArr = {token, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12};
            p = tokenArr;
            q = EnumEntriesKt.a(tokenArr);
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) p.clone();
        }
    }

    JsonReader G();

    JsonReader K();

    JsonNumber Q0();

    ArrayList getPath();

    boolean hasNext();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    void nextNull();

    String nextString();

    void o();

    int o2(List list);

    Token peek();

    void skipValue();

    JsonReader w();

    JsonReader y();
}
