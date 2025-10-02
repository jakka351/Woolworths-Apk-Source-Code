package io.reactivex.rxkotlin;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxkotlin"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class DisposableKt {
    public static final void a(CompositeDisposable receiver, Disposable disposable) {
        Intrinsics.i(receiver, "$receiver");
        receiver.d(disposable);
    }
}
