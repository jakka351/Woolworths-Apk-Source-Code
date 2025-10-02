package com.apollographql.apollo.ast.internal;

import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token;", "", "StartOfFile", "EndOfFile", "ExclamationPoint", "QuestionMark", "Dollar", "Ampersand", "LeftParenthesis", "RightParenthesis", "Spread", "Colon", "Equals", "At", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Pipe", "Name", "Int", "Float", "String", "Lcom/apollographql/apollo/ast/internal/Token$Ampersand;", "Lcom/apollographql/apollo/ast/internal/Token$At;", "Lcom/apollographql/apollo/ast/internal/Token$Colon;", "Lcom/apollographql/apollo/ast/internal/Token$Dollar;", "Lcom/apollographql/apollo/ast/internal/Token$EndOfFile;", "Lcom/apollographql/apollo/ast/internal/Token$Equals;", "Lcom/apollographql/apollo/ast/internal/Token$ExclamationPoint;", "Lcom/apollographql/apollo/ast/internal/Token$Float;", "Lcom/apollographql/apollo/ast/internal/Token$Int;", "Lcom/apollographql/apollo/ast/internal/Token$LeftBrace;", "Lcom/apollographql/apollo/ast/internal/Token$LeftBracket;", "Lcom/apollographql/apollo/ast/internal/Token$LeftParenthesis;", "Lcom/apollographql/apollo/ast/internal/Token$Name;", "Lcom/apollographql/apollo/ast/internal/Token$Pipe;", "Lcom/apollographql/apollo/ast/internal/Token$QuestionMark;", "Lcom/apollographql/apollo/ast/internal/Token$RightBrace;", "Lcom/apollographql/apollo/ast/internal/Token$RightBracket;", "Lcom/apollographql/apollo/ast/internal/Token$RightParenthesis;", "Lcom/apollographql/apollo/ast/internal/Token$Spread;", "Lcom/apollographql/apollo/ast/internal/Token$StartOfFile;", "Lcom/apollographql/apollo/ast/internal/Token$String;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Token {

    /* renamed from: a, reason: collision with root package name */
    public final int f13577a;
    public final int b;
    public final int c;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Ampersand;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Ampersand extends Token {
        public Ampersand(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "&";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$At;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class At extends Token {
        public final java.lang.String toString() {
            return "@";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Colon;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Colon extends Token {
        public final java.lang.String toString() {
            return ":";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Dollar;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Dollar extends Token {
        public Dollar(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "$";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$EndOfFile;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EndOfFile extends Token {
        public final java.lang.String toString() {
            return "EOF";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Equals;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Equals extends Token {
        public Equals(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "=";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$ExclamationPoint;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ExclamationPoint extends Token {
        public ExclamationPoint(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "!";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Float;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Float extends Token {
        public final java.lang.String e;

        public Float(java.lang.String str, int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
            this.e = str;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getE() {
            return this.e;
        }

        public final java.lang.String toString() {
            return "float: " + this.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Int;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Int extends Token {
        public final java.lang.String e;

        public Int(java.lang.String str, int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
            this.e = str;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getE() {
            return this.e;
        }

        public final java.lang.String toString() {
            return "int: " + this.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$LeftBrace;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LeftBrace extends Token {
        public final java.lang.String toString() {
            return "{";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$LeftBracket;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LeftBracket extends Token {
        public LeftBracket(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "[";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$LeftParenthesis;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LeftParenthesis extends Token {
        public final java.lang.String toString() {
            return "(";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Name;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Name extends Token {
        public final java.lang.String e;

        public Name(java.lang.String str, int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
            this.e = str;
        }

        public final java.lang.String toString() {
            return "name: " + this.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Pipe;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Pipe extends Token {
        public Pipe(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return lllqqql.c0063ccc0063c;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$QuestionMark;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class QuestionMark extends Token {
        public QuestionMark(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "?";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$RightBrace;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RightBrace extends Token {
        public final java.lang.String toString() {
            return "}";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$RightBracket;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RightBracket extends Token {
        public RightBracket(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return "]";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$RightParenthesis;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RightParenthesis extends Token {
        public RightParenthesis(int i, int i2, int i3) {
            super(i, i + 1, i2, i3);
        }

        public final java.lang.String toString() {
            return ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$Spread;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Spread extends Token {
        public final java.lang.String toString() {
            return "...";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$StartOfFile;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartOfFile extends Token {
        public static final StartOfFile e = new StartOfFile(0, 0, 1, 1);

        public final java.lang.String toString() {
            return "SOF";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Token$String;", "Lcom/apollographql/apollo/ast/internal/Token;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class String extends Token {
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public String(java.lang.String value, int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
            Intrinsics.h(value, "value");
            this.e = value;
        }

        public final java.lang.String toString() {
            return b.r(new StringBuilder("string: \""), this.e, '\"');
        }
    }

    public Token(int i, int i2, int i3, int i4) {
        this.f13577a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
