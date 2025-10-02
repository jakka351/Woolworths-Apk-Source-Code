package com.woolworths.scanlibrary.util.lists;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils", f = "SnGShoppingListUtils.kt", l = {79}, m = "getCartResponse")
/* loaded from: classes7.dex */
final class SnGShoppingListUtils$getCartResponse$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SnGShoppingListUtils q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnGShoppingListUtils$getCartResponse$1(SnGShoppingListUtils snGShoppingListUtils, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = snGShoppingListUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
