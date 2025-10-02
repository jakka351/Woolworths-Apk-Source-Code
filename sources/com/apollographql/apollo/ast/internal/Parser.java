package com.apollographql.apollo.ast.internal;

import YU.a;
import com.apollographql.apollo.ast.GQLArgument;
import com.apollographql.apollo.ast.GQLBooleanValue;
import com.apollographql.apollo.ast.GQLDirective;
import com.apollographql.apollo.ast.GQLEnumValue;
import com.apollographql.apollo.ast.GQLEnumValueDefinition;
import com.apollographql.apollo.ast.GQLField;
import com.apollographql.apollo.ast.GQLFieldDefinition;
import com.apollographql.apollo.ast.GQLFloatValue;
import com.apollographql.apollo.ast.GQLFragmentSpread;
import com.apollographql.apollo.ast.GQLInlineFragment;
import com.apollographql.apollo.ast.GQLInputValueDefinition;
import com.apollographql.apollo.ast.GQLIntValue;
import com.apollographql.apollo.ast.GQLListType;
import com.apollographql.apollo.ast.GQLListValue;
import com.apollographql.apollo.ast.GQLNamedType;
import com.apollographql.apollo.ast.GQLNonNullType;
import com.apollographql.apollo.ast.GQLNullValue;
import com.apollographql.apollo.ast.GQLObjectField;
import com.apollographql.apollo.ast.GQLObjectValue;
import com.apollographql.apollo.ast.GQLOperationDefinition;
import com.apollographql.apollo.ast.GQLOperationTypeDefinition;
import com.apollographql.apollo.ast.GQLSelection;
import com.apollographql.apollo.ast.GQLStringValue;
import com.apollographql.apollo.ast.GQLType;
import com.apollographql.apollo.ast.GQLValue;
import com.apollographql.apollo.ast.GQLVariableDefinition;
import com.apollographql.apollo.ast.GQLVariableValue;
import com.apollographql.apollo.ast.ParserOptions;
import com.apollographql.apollo.ast.SourceLocation;
import com.apollographql.apollo.ast.internal.Token;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Parser;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Parser {

    /* renamed from: a, reason: collision with root package name */
    public final Lexer f13576a;
    public Token b;
    public Token c;
    public Token d;
    public final boolean e;
    public final boolean f;

    public Parser(String src, ParserOptions parserOptions) {
        Intrinsics.h(src, "src");
        Lexer lexer = new Lexer(src);
        this.f13576a = lexer;
        Token tokenD = lexer.d();
        this.b = tokenD;
        this.c = tokenD;
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r5.equals("mutation") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r5.equals("subscription") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        if (r5.equals(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        return r20.s(r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.apollographql.apollo.ast.GQLDefinition a(final com.apollographql.apollo.ast.internal.Parser r20) throws com.apollographql.apollo.ast.internal.ParserException {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.internal.Parser.a(com.apollographql.apollo.ast.internal.Parser):com.apollographql.apollo.ast.GQLDefinition");
    }

    public static final GQLInputValueDefinition b(Parser parser) throws ParserException {
        Token token = parser.b;
        parser.j();
        String strQ = parser.q();
        if (!(parser.b instanceof Token.Colon)) {
            throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser.b + "'.", parser.b);
        }
        parser.e();
        GQLType gQLTypeV = parser.v();
        Token token2 = parser.b;
        if (token2 instanceof Token.Equals) {
            parser.e();
        } else {
            token2 = null;
        }
        GQLValue gQLValueX = token2 != null ? parser.x(true) : null;
        ArrayList arrayListK = parser.k(true);
        parser.z(token);
        return new GQLInputValueDefinition(strQ, arrayListK, gQLTypeV, gQLValueX);
    }

    public static final GQLOperationTypeDefinition c(Parser parser) throws ParserException {
        Token token = parser.b;
        String strT = parser.t();
        if (parser.b instanceof Token.Colon) {
            parser.e();
            GQLNamedType gQLNamedTypeR = parser.r();
            parser.z(token);
            return new GQLOperationTypeDefinition(strT, gQLNamedTypeR.getF13557a());
        }
        throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser.b + "'.", parser.b);
    }

    public static final GQLSelection d(final Parser parser) throws ParserException {
        String strQ;
        String str;
        Token token = parser.b;
        List arrayList = null;
        if (token instanceof Token.Spread) {
            parser.e();
            Token.Name nameG = parser.g("on");
            if (nameG == null && (parser.b instanceof Token.Name)) {
                String strN = parser.n();
                ArrayList arrayListK = parser.k(false);
                parser.z(token);
                return new GQLFragmentSpread(strN, arrayListK);
            }
            GQLNamedType gQLNamedTypeR = nameG != null ? parser.r() : null;
            ArrayList arrayListK2 = parser.k(false);
            ArrayList arrayListU = parser.u();
            parser.z(token);
            return new GQLInlineFragment(gQLNamedTypeR, arrayListK2, arrayListU);
        }
        String strQ2 = parser.q();
        Token token2 = parser.b;
        if (token2 instanceof Token.Colon) {
            parser.e();
        } else {
            token2 = null;
        }
        if (token2 != null) {
            str = strQ2;
            strQ = parser.q();
        } else {
            strQ = strQ2;
            str = null;
        }
        List listI = parser.i(false);
        ArrayList arrayListK3 = parser.k(false);
        if (parser.b instanceof Token.LeftBrace) {
            parser.e();
            Function1<List<GQLSelection>, Unit> function1 = new Function1<List<GQLSelection>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseOptionalSelectionSet$$inlined$parseNonEmptyListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token3;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        buildList.add(Parser.d(parser));
                        Parser parser2 = this.d;
                        token3 = parser2.b;
                        if (token3 instanceof Token.RightBrace) {
                            parser2.e();
                        } else {
                            token3 = null;
                        }
                    } while (token3 == null);
                    return Unit.f24250a;
                }
            };
            arrayList = new ArrayList();
            function1.invoke(arrayList);
        }
        if (arrayList == null) {
            arrayList = EmptyList.d;
        }
        parser.z(token);
        return new GQLField(str, strQ, arrayListK3, listI, arrayList);
    }

    public final void A(Token token) throws ParserException {
        if (token == null) {
            token = this.b;
        }
        throw new ParserException("Unexpected token: '" + token + '\'', token);
    }

    public final void e() {
        this.c = this.b;
        Token token = this.d;
        if (token == null) {
            this.b = this.f13576a.d();
            return;
        }
        Intrinsics.e(token);
        this.b = token;
        this.d = null;
    }

    public final void f(String str) throws ParserException {
        Token token = this.b;
        if ((token instanceof Token.Name) && ((Token.Name) token).e.equals(str)) {
            e();
        } else {
            A(null);
            throw null;
        }
    }

    public final Token.Name g(String str) {
        Token token = this.b;
        if (!(token instanceof Token.Name)) {
            return null;
        }
        Token.Name name = (Token.Name) token;
        if (!name.e.equals(str)) {
            return null;
        }
        e();
        return name;
    }

    public final List h() {
        ArrayList arrayList;
        if (this.b instanceof Token.LeftParenthesis) {
            e();
            Function1<List<GQLInputValueDefinition>, Unit> function1 = new Function1<List<GQLInputValueDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseArgumentDefinitions$$inlined$parseNonEmptyListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        buildList.add(Parser.b(this));
                        Parser parser = this.d;
                        token = parser.b;
                        if (token instanceof Token.RightParenthesis) {
                            parser.e();
                        } else {
                            token = null;
                        }
                    } while (token == null);
                    return Unit.f24250a;
                }
            };
            ArrayList arrayList2 = new ArrayList();
            function1.invoke(arrayList2);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.d : arrayList;
    }

    public final List i(final boolean z) {
        ArrayList arrayList;
        if (this.b instanceof Token.LeftParenthesis) {
            e();
            Function1<List<GQLArgument>, Unit> function1 = new Function1<List<GQLArgument>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseArguments$$inlined$parseNonEmptyListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        Parser parser = this;
                        Token token2 = parser.b;
                        String strQ = parser.q();
                        if (!(parser.b instanceof Token.Colon)) {
                            throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser.b + "'.", parser.b);
                        }
                        parser.e();
                        GQLValue gQLValueX = parser.x(z);
                        parser.z(token2);
                        buildList.add(new GQLArgument(strQ, gQLValueX));
                        Parser parser2 = this.d;
                        token = parser2.b;
                        if (token instanceof Token.RightParenthesis) {
                            parser2.e();
                        } else {
                            token = null;
                        }
                    } while (token == null);
                    return Unit.f24250a;
                }
            };
            arrayList = new ArrayList();
            function1.invoke(arrayList);
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.d : arrayList;
    }

    public final String j() {
        Token token = this.b;
        if (token instanceof Token.String) {
            e();
        } else {
            token = null;
        }
        Token.String string = (Token.String) token;
        if (string != null) {
            return string.e;
        }
        return null;
    }

    public final ArrayList k(boolean z) throws ParserException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Token token = this.b;
            if (!(token instanceof Token.At)) {
                return arrayList;
            }
            e();
            String strQ = q();
            List listI = i(z);
            z(token);
            arrayList.add(new GQLDirective(strQ, listI));
        }
    }

    public final List l() {
        ArrayList arrayList;
        if (this.b instanceof Token.LeftBrace) {
            e();
            Function1<List<GQLEnumValueDefinition>, Unit> function1 = new Function1<List<GQLEnumValueDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseEnumValueDefinitions$$inlined$parseNonEmptyListOrNull$1
                /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.util.List r7 = (java.util.List) r7
                        java.lang.String r0 = "$this$buildList"
                        kotlin.jvm.internal.Intrinsics.h(r7, r0)
                    L7:
                        com.apollographql.apollo.ast.internal.Parser r0 = r2
                        com.apollographql.apollo.ast.internal.Token r1 = r0.b
                        r0.j()
                        com.apollographql.apollo.ast.internal.Token r2 = r0.b
                        boolean r3 = r2 instanceof com.apollographql.apollo.ast.internal.Token.Name
                        if (r3 == 0) goto L7a
                        r0.e()
                        r3 = r2
                        com.apollographql.apollo.ast.internal.Token$Name r3 = (com.apollographql.apollo.ast.internal.Token.Name) r3
                        java.lang.String r3 = r3.e
                        int r4 = r3.hashCode()
                        r5 = 3392903(0x33c587, float:4.75447E-39)
                        if (r4 == r5) goto L42
                        r5 = 3569038(0x36758e, float:5.001287E-39)
                        if (r4 == r5) goto L39
                        r5 = 97196323(0x5cb1923, float:1.9099262E-35)
                        if (r4 == r5) goto L30
                        goto L4a
                    L30:
                        java.lang.String r4 = "false"
                        boolean r4 = r3.equals(r4)
                        if (r4 != 0) goto L6c
                        goto L4a
                    L39:
                        java.lang.String r4 = "true"
                        boolean r4 = r3.equals(r4)
                        if (r4 != 0) goto L6c
                        goto L4a
                    L42:
                        java.lang.String r4 = "null"
                        boolean r4 = r3.equals(r4)
                        if (r4 != 0) goto L6c
                    L4a:
                        r2 = 1
                        java.util.ArrayList r2 = r0.k(r2)
                        com.apollographql.apollo.ast.GQLEnumValueDefinition r4 = new com.apollographql.apollo.ast.GQLEnumValueDefinition
                        r0.z(r1)
                        r4.<init>(r3, r2)
                        r7.add(r4)
                        com.apollographql.apollo.ast.internal.Parser r0 = r6.d
                        com.apollographql.apollo.ast.internal.Token r1 = r0.b
                        boolean r2 = r1 instanceof com.apollographql.apollo.ast.internal.Token.RightBrace
                        if (r2 == 0) goto L66
                        r0.e()
                        goto L67
                    L66:
                        r1 = 0
                    L67:
                        if (r1 == 0) goto L7
                        kotlin.Unit r7 = kotlin.Unit.f24250a
                        return r7
                    L6c:
                        com.apollographql.apollo.ast.internal.ParserException r7 = new com.apollographql.apollo.ast.internal.ParserException
                        java.lang.String r0 = "'"
                        java.lang.String r1 = "' is reserved and cannot be used for an enum value"
                        java.lang.String r0 = YU.a.h(r0, r3, r1)
                        r7.<init>(r0, r2)
                        throw r7
                    L7a:
                        com.apollographql.apollo.ast.internal.ParserException r7 = new com.apollographql.apollo.ast.internal.ParserException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Expected "
                        r1.<init>(r2)
                        java.lang.Class<com.apollographql.apollo.ast.internal.Token$Name> r2 = com.apollographql.apollo.ast.internal.Token.Name.class
                        kotlin.jvm.internal.ReflectionFactory r3 = kotlin.jvm.internal.Reflection.f24268a
                        kotlin.reflect.KClass r2 = r3.b(r2)
                        java.lang.String r2 = r2.B()
                        r1.append(r2)
                        java.lang.String r2 = ", found '"
                        r1.append(r2)
                        com.apollographql.apollo.ast.internal.Token r2 = r0.b
                        r1.append(r2)
                        java.lang.String r2 = "'."
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        com.apollographql.apollo.ast.internal.Token r0 = r0.b
                        r7.<init>(r1, r0)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.internal.Parser$parseEnumValueDefinitions$$inlined$parseNonEmptyListOrNull$1.invoke(java.lang.Object):java.lang.Object");
                }
            };
            ArrayList arrayList2 = new ArrayList();
            function1.invoke(arrayList2);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.d : arrayList;
    }

    public final List m() {
        ArrayList arrayList;
        if (this.b instanceof Token.LeftBrace) {
            e();
            Function1<List<GQLFieldDefinition>, Unit> function1 = new Function1<List<GQLFieldDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseFieldDefinitions$$inlined$parseNonEmptyListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        Parser parser = this;
                        Token token2 = parser.b;
                        parser.j();
                        String strQ = parser.q();
                        List listH = parser.h();
                        if (!(parser.b instanceof Token.Colon)) {
                            throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser.b + "'.", parser.b);
                        }
                        parser.e();
                        GQLType gQLTypeV = parser.v();
                        ArrayList arrayListK = parser.k(true);
                        parser.z(token2);
                        buildList.add(new GQLFieldDefinition(strQ, listH, gQLTypeV, arrayListK));
                        Parser parser2 = this.d;
                        token = parser2.b;
                        if (token instanceof Token.RightBrace) {
                            parser2.e();
                        } else {
                            token = null;
                        }
                    } while (token == null);
                    return Unit.f24250a;
                }
            };
            ArrayList arrayList2 = new ArrayList();
            function1.invoke(arrayList2);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.d : arrayList;
    }

    public final String n() throws ParserException {
        Token token = this.b;
        Intrinsics.f(token, "null cannot be cast to non-null type com.apollographql.apollo.ast.internal.Token.Name");
        if (((Token.Name) token).e.equals("on")) {
            throw new ParserException("'on' is not a valid fragment name", this.b);
        }
        return q();
    }

    public final List o() {
        if (g("implements") == null) {
            return EmptyList.d;
        }
        if (this.b instanceof Token.Ampersand) {
            e();
        }
        Function1<List<String>, Unit> function1 = new Function1<List<String>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseImplementsInterfaces$$inlined$parseNonEmptyDelimitedList$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Token token;
                List buildList = (List) obj;
                Intrinsics.h(buildList, "$this$buildList");
                do {
                    buildList.add(this.q());
                    Parser parser = this.d;
                    token = parser.b;
                    if (token instanceof Token.Ampersand) {
                        parser.e();
                    } else {
                        token = null;
                    }
                } while (token != null);
                return Unit.f24250a;
            }
        };
        ArrayList arrayList = new ArrayList();
        function1.invoke(arrayList);
        return arrayList;
    }

    public final List p() {
        ArrayList arrayList;
        if (this.b instanceof Token.LeftBrace) {
            e();
            Function1<List<GQLInputValueDefinition>, Unit> function1 = new Function1<List<GQLInputValueDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseInputFieldDefinitions$$inlined$parseNonEmptyListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        buildList.add(Parser.b(this));
                        Parser parser = this.d;
                        token = parser.b;
                        if (token instanceof Token.RightBrace) {
                            parser.e();
                        } else {
                            token = null;
                        }
                    } while (token == null);
                    return Unit.f24250a;
                }
            };
            ArrayList arrayList2 = new ArrayList();
            function1.invoke(arrayList2);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.d : arrayList;
    }

    public final String q() throws ParserException {
        Token token = this.b;
        if (token instanceof Token.Name) {
            e();
            return ((Token.Name) token).e;
        }
        throw new ParserException("Expected " + Reflection.f24268a.b(Token.Name.class).B() + ", found '" + this.b + "'.", this.b);
    }

    public final GQLNamedType r() throws ParserException {
        Token token = this.b;
        String strQ = q();
        z(token);
        return new GQLNamedType(strQ);
    }

    public final GQLOperationDefinition s(Token token) throws ParserException {
        if (this.b instanceof Token.String) {
            e();
        }
        boolean z = this.b instanceof Token.LeftBrace;
        List arrayList = EmptyList.d;
        if (z) {
            ArrayList arrayListU = u();
            z(token);
            return new GQLOperationDefinition(SearchIntents.EXTRA_QUERY, null, arrayListU, arrayList, arrayList);
        }
        String strT = t();
        String strQ = this.b instanceof Token.Name ? q() : null;
        if (this.b instanceof Token.LeftParenthesis) {
            e();
            Function1<List<GQLVariableDefinition>, Unit> function1 = new Function1<List<GQLVariableDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseVariableDefinitions$$inlined$parseListOrNull$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    while (true) {
                        Parser parser = this.d;
                        Token token2 = parser.b;
                        GQLValue gQLValueX = null;
                        if (token2 instanceof Token.RightParenthesis) {
                            parser.e();
                        } else {
                            token2 = null;
                        }
                        if (token2 != null) {
                            return Unit.f24250a;
                        }
                        Parser parser2 = this;
                        Token token3 = parser2.b;
                        if (!(token3 instanceof Token.Dollar)) {
                            throw new ParserException("Expected " + Reflection.f24268a.b(Token.Dollar.class).B() + ", found '" + parser2.b + "'.", parser2.b);
                        }
                        parser2.e();
                        String strQ2 = parser2.q();
                        if (!(parser2.b instanceof Token.Colon)) {
                            throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser2.b + "'.", parser2.b);
                        }
                        parser2.e();
                        GQLType gQLTypeV = parser2.v();
                        Token token4 = parser2.b;
                        if (token4 instanceof Token.Equals) {
                            parser2.e();
                        } else {
                            token4 = null;
                        }
                        if (token4 != null) {
                            gQLValueX = parser2.x(true);
                        }
                        ArrayList arrayListK = parser2.k(true);
                        parser2.z(token3);
                        buildList.add(new GQLVariableDefinition(strQ2, gQLTypeV, gQLValueX, arrayListK));
                    }
                }
            };
            arrayList = new ArrayList();
            function1.invoke(arrayList);
        }
        List list = arrayList;
        ArrayList arrayListK = k(false);
        ArrayList arrayListU2 = u();
        z(token);
        return new GQLOperationDefinition(strT, strQ, arrayListU2, list, arrayListK);
    }

    public final String t() throws ParserException {
        Token token = this.b;
        if (token instanceof Token.Name) {
            e();
            return ((Token.Name) token).e;
        }
        throw new ParserException("Expected " + Reflection.f24268a.b(Token.Name.class).B() + ", found '" + this.b + "'.", this.b);
    }

    public final ArrayList u() throws ParserException {
        if (this.b instanceof Token.LeftBrace) {
            e();
            Function1<List<GQLSelection>, Unit> function1 = new Function1<List<GQLSelection>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseSelectionSet$$inlined$parseNonEmptyList$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Token token;
                    List buildList = (List) obj;
                    Intrinsics.h(buildList, "$this$buildList");
                    do {
                        buildList.add(Parser.d(this));
                        Parser parser = this.d;
                        token = parser.b;
                        if (token instanceof Token.RightBrace) {
                            parser.e();
                        } else {
                            token = null;
                        }
                    } while (token == null);
                    return Unit.f24250a;
                }
            };
            ArrayList arrayList = new ArrayList();
            function1.invoke(arrayList);
            return arrayList;
        }
        throw new ParserException("Expected " + Reflection.f24268a.b(Token.LeftBrace.class).B() + ", found '" + this.b + "'.", this.b);
    }

    public final GQLType v() throws ParserException {
        Token token;
        GQLType gQLTypeR;
        Token token2 = this.b;
        if (token2 instanceof Token.LeftBracket) {
            e();
            token = token2;
        } else {
            token = null;
        }
        if (token != null) {
            GQLType gQLTypeV = v();
            if (!(this.b instanceof Token.RightBracket)) {
                throw new ParserException("Expected " + Reflection.f24268a.b(Token.RightBracket.class).B() + ", found '" + this.b + "'.", this.b);
            }
            e();
            z(token2);
            gQLTypeR = new GQLListType(gQLTypeV);
        } else {
            gQLTypeR = r();
        }
        if (!(this.b instanceof Token.ExclamationPoint)) {
            return gQLTypeR;
        }
        e();
        z(token2);
        return new GQLNonNullType(gQLTypeR);
    }

    public final List w() {
        Token token = this.b;
        if (token instanceof Token.Equals) {
            e();
        } else {
            token = null;
        }
        if (token == null) {
            return EmptyList.d;
        }
        if (this.b instanceof Token.Pipe) {
            e();
        }
        Function1<List<GQLNamedType>, Unit> function1 = new Function1<List<GQLNamedType>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseUnionMemberTypes$$inlined$parseNonEmptyDelimitedList$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Token token2;
                List buildList = (List) obj;
                Intrinsics.h(buildList, "$this$buildList");
                do {
                    buildList.add(this.r());
                    Parser parser = this.d;
                    token2 = parser.b;
                    if (token2 instanceof Token.Pipe) {
                        parser.e();
                    } else {
                        token2 = null;
                    }
                } while (token2 != null);
                return Unit.f24250a;
            }
        };
        ArrayList arrayList = new ArrayList();
        function1.invoke(arrayList);
        return arrayList;
    }

    public final GQLValue x(final boolean z) throws ParserException {
        Token token = this.b;
        if (token instanceof Token.LeftBracket) {
            y();
            if (this.b instanceof Token.LeftBracket) {
                e();
                Function1<List<GQLValue>, Unit> function1 = new Function1<List<GQLValue>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseList$$inlined$parseList$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List buildList = (List) obj;
                        Intrinsics.h(buildList, "$this$buildList");
                        while (true) {
                            Parser parser = this.d;
                            Token token2 = parser.b;
                            if (token2 instanceof Token.RightBracket) {
                                parser.e();
                            } else {
                                token2 = null;
                            }
                            if (token2 != null) {
                                return Unit.f24250a;
                            }
                            buildList.add(this.x(z));
                        }
                    }
                };
                ArrayList arrayList = new ArrayList();
                function1.invoke(arrayList);
                return new GQLListValue(arrayList);
            }
            throw new ParserException("Expected " + Reflection.f24268a.b(Token.LeftBracket.class).B() + ", found '" + this.b + "'.", this.b);
        }
        if (token instanceof Token.LeftBrace) {
            y();
            if (this.b instanceof Token.LeftBrace) {
                e();
                Function1<List<GQLObjectField>, Unit> function12 = new Function1<List<GQLObjectField>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseObject$$inlined$parseList$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List buildList = (List) obj;
                        Intrinsics.h(buildList, "$this$buildList");
                        while (true) {
                            Parser parser = this.d;
                            Token token2 = parser.b;
                            if (token2 instanceof Token.RightBrace) {
                                parser.e();
                            } else {
                                token2 = null;
                            }
                            if (token2 != null) {
                                return Unit.f24250a;
                            }
                            Parser parser2 = this;
                            Token token3 = parser2.b;
                            String strQ = parser2.q();
                            if (!(parser2.b instanceof Token.Colon)) {
                                throw new ParserException("Expected " + Reflection.f24268a.b(Token.Colon.class).B() + ", found '" + parser2.b + "'.", parser2.b);
                            }
                            parser2.e();
                            GQLValue gQLValueX = parser2.x(z);
                            parser2.z(token3);
                            buildList.add(new GQLObjectField(strQ, gQLValueX));
                        }
                    }
                };
                ArrayList arrayList2 = new ArrayList();
                function12.invoke(arrayList2);
                return new GQLObjectValue(arrayList2);
            }
            throw new ParserException("Expected " + Reflection.f24268a.b(Token.LeftBrace.class).B() + ", found '" + this.b + "'.", this.b);
        }
        if (token instanceof Token.Int) {
            y();
            GQLIntValue gQLIntValue = new GQLIntValue(((Token.Int) token).getE());
            e();
            return gQLIntValue;
        }
        if (token instanceof Token.Float) {
            y();
            GQLFloatValue gQLFloatValue = new GQLFloatValue(((Token.Float) token).getE());
            e();
            return gQLFloatValue;
        }
        if (token instanceof Token.String) {
            y();
            GQLStringValue gQLStringValue = new GQLStringValue(((Token.String) token).e);
            e();
            return gQLStringValue;
        }
        if (!(token instanceof Token.Name)) {
            if (!(token instanceof Token.Dollar)) {
                A(null);
                throw null;
            }
            e();
            if (!z) {
                String strQ = q();
                z(token);
                return new GQLVariableValue(strQ);
            }
            Token token2 = this.b;
            if (token2 instanceof Token.Name) {
                e();
            } else {
                token2 = null;
            }
            Token.Name name = (Token.Name) token2;
            if (name != null) {
                throw new ParserException(a.o(new StringBuilder("Unexpected variable '"), name.e, "' in constant value."), name);
            }
            A(name);
            throw null;
        }
        String str = ((Token.Name) token).e;
        int iHashCode = str.hashCode();
        if (iHashCode != 3392903) {
            if (iHashCode != 3569038) {
                if (iHashCode == 97196323 && str.equals("false")) {
                    y();
                    GQLBooleanValue gQLBooleanValue = new GQLBooleanValue(false);
                    e();
                    return gQLBooleanValue;
                }
            } else if (str.equals("true")) {
                y();
                GQLBooleanValue gQLBooleanValue2 = new GQLBooleanValue(true);
                e();
                return gQLBooleanValue2;
            }
        } else if (str.equals("null")) {
            y();
            GQLNullValue gQLNullValue = new GQLNullValue();
            e();
            return gQLNullValue;
        }
        y();
        GQLEnumValue gQLEnumValue = new GQLEnumValue(str);
        e();
        return gQLEnumValue;
    }

    public final SourceLocation y() {
        if (!this.e) {
            return null;
        }
        Token token = this.b;
        int i = token.f13577a;
        return new SourceLocation(token.c, token.d);
    }

    public final SourceLocation z(Token token) {
        if (!this.e) {
            return null;
        }
        int i = token.f13577a;
        int i2 = this.c.b;
        return new SourceLocation(token.c, token.d);
    }
}
