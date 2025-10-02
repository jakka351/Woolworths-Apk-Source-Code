package com.apollographql.apollo.ast;

import au.com.woolworths.android.onesite.analytics.a11y.a;
import com.apollographql.apollo.ast.internal.LexerException;
import com.apollographql.apollo.ast.internal.Parser;
import com.apollographql.apollo.ast.internal.ParserException;
import com.apollographql.apollo.ast.internal.Token;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"com/apollographql/apollo/ast/ApolloParser__ApiKt", "com/apollographql/apollo/ast/ApolloParser__Api_filesystemKt", "com/apollographql/apollo/ast/ApolloParser__Api_jvmKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloParser {
    public static GQLResult a(String str) {
        ParserOptions parserOptions = ParserOptions.f13572a;
        Intrinsics.h(str, "<this>");
        try {
            return new GQLResult(new a(17).invoke(new Parser(str, parserOptions)), EmptyList.d);
        } catch (LexerException e) {
            return new GQLResult(null, CollectionsKt.Q(new ParsingError(e.d, new SourceLocation(e.e, e.f))));
        } catch (ParserException e2) {
            Token token = e2.e;
            int i = token.f13577a;
            return new GQLResult(null, CollectionsKt.Q(new ParsingError(e2.d, new SourceLocation(token.c, token.d))));
        }
    }
}
