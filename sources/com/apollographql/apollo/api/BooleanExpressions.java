package com.apollographql.apollo.api;

import com.apollographql.apollo.api.BooleanExpression;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BooleanExpressions {
    public static final BooleanExpression.And a(BooleanExpression... booleanExpressionArr) {
        return new BooleanExpression.And(CollectionsKt.L0(ArraysKt.l0(booleanExpressionArr)));
    }

    public static final boolean b(BooleanExpression booleanExpression, a aVar) {
        Intrinsics.h(booleanExpression, "<this>");
        if (booleanExpression.equals(BooleanExpression.True.f13502a)) {
            return true;
        }
        if (booleanExpression.equals(BooleanExpression.False.f13500a)) {
            return false;
        }
        if (booleanExpression instanceof BooleanExpression.Not) {
            return !b(((BooleanExpression.Not) booleanExpression).f13501a, aVar);
        }
        if (booleanExpression instanceof BooleanExpression.Or) {
            throw null;
        }
        if (!(booleanExpression instanceof BooleanExpression.And)) {
            if (booleanExpression instanceof BooleanExpression.Element) {
                return ((Boolean) aVar.invoke(((BooleanExpression.Element) booleanExpression).f13499a)).booleanValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        Set set = ((BooleanExpression.And) booleanExpression).f13498a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!b((BooleanExpression) it.next(), aVar)) {
                return false;
            }
        }
        return true;
    }

    public static final BooleanExpression.Element c(String... strArr) {
        return new BooleanExpression.Element(new BPossibleTypes(ArraysKt.r0(strArr)));
    }

    public static final BooleanExpression.Element d(String str) {
        return new BooleanExpression.Element(new BVariable(str));
    }
}
