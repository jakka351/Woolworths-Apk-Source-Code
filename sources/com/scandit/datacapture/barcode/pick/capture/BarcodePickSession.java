package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSession;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "", "", "getTrackedItems", "()Ljava/util/Set;", "trackedItems", "getAddedItems", "addedItems", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickSession implements BarcodePickSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17896a;
    private final Lazy b;

    public BarcodePickSession(@NotNull Function0<? extends NativeBarcodePickPublicSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17896a = getImpl;
        this.b = LazyKt.b(new f(this));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    @NotNull
    public Set<String> getAddedItems() {
        return ((BarcodePickSessionProxyAdapter) this.b.getD()).getAddedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    @NotNull
    public Set<String> getTrackedItems() {
        return ((BarcodePickSessionProxyAdapter) this.b.getD()).getTrackedItems();
    }
}
