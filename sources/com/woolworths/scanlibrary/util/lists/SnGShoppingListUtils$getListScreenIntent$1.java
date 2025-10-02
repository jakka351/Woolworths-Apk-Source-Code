package com.woolworths.scanlibrary.util.lists;

import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils", f = "SnGShoppingListUtils.kt", l = {35, 36}, m = "getListScreenIntent$scanGoLibrary_release")
/* loaded from: classes7.dex */
final class SnGShoppingListUtils$getListScreenIntent$1 extends ContinuationImpl {
    public ListsInMemoryRepository p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SnGShoppingListUtils r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnGShoppingListUtils$getListScreenIntent$1(SnGShoppingListUtils snGShoppingListUtils, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = snGShoppingListUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(0, this);
    }
}
