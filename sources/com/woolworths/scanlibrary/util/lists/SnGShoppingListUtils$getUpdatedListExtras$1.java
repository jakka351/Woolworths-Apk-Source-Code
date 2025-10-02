package com.woolworths.scanlibrary.util.lists;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils", f = "SnGShoppingListUtils.kt", l = {60}, m = "getUpdatedListExtras")
/* loaded from: classes7.dex */
final class SnGShoppingListUtils$getUpdatedListExtras$1 extends ContinuationImpl {
    public int p;
    public Ref.IntRef q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SnGShoppingListUtils s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnGShoppingListUtils$getUpdatedListExtras$1(SnGShoppingListUtils snGShoppingListUtils, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = snGShoppingListUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(0, this);
    }
}
