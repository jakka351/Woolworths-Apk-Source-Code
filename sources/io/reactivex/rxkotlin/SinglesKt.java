package io.reactivex.rxkotlin;

import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleZipArray;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxkotlin"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class SinglesKt {
    public static final SingleZipArray a(Single single, SingleCreate singleCreate) {
        return Single.j(single, singleCreate, SinglesKt$zipWith$2.d);
    }
}
