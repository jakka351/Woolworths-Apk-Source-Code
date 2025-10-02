package com.scandit.datacapture.barcode.count.capture.list;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureList;", "_impl", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSession;", "_session", "", "getTargetBarcodesQuantity$scandit_barcode_capture", "()I", "getTargetBarcodesQuantity", "impl", "session", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureList;Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSession;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCountCaptureList implements BarcodeCountCaptureListProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountCaptureListSession f17490a;
    private final /* synthetic */ BarcodeCountCaptureListProxyAdapter b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList$Companion;", "", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "targetBarcodes", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountCaptureList create(@NotNull BarcodeCountCaptureListListener listener, @Nullable List<TargetBarcode> targetBarcodes) {
            HashSet hashSetE0;
            Intrinsics.h(listener, "listener");
            if (targetBarcodes != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.s(targetBarcodes, 10));
                for (TargetBarcode targetBarcode : targetBarcodes) {
                    arrayList.add(NativeTargetBarcode.create(targetBarcode.getData(), targetBarcode.getQuantity()));
                }
                hashSetE0 = CollectionsKt.E0(arrayList);
            } else {
                hashSetE0 = null;
            }
            NativeBarcodeCountCaptureList impl = NativeBarcodeCountCaptureList.createForAndroid(hashSetE0);
            Intrinsics.g(impl, "impl");
            BarcodeCountCaptureList barcodeCountCaptureList = new BarcodeCountCaptureList(impl, new BarcodeCountCaptureListSession(new a(impl)));
            barcodeCountCaptureList.getF17492a().addListenerAsync(new BarcodeCountCaptureListListenerReversedAdapter(listener, barcodeCountCaptureList, null, 4, null));
            return barcodeCountCaptureList;
        }

        private Companion() {
        }
    }

    public BarcodeCountCaptureList(@NotNull NativeBarcodeCountCaptureList impl, @NotNull BarcodeCountCaptureListSession session) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(session, "session");
        this.f17490a = session;
        this.b = new BarcodeCountCaptureListProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountCaptureList create(@NotNull BarcodeCountCaptureListListener barcodeCountCaptureListListener, @Nullable List<TargetBarcode> list) {
        return INSTANCE.create(barcodeCountCaptureListListener, list);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountCaptureList getF17492a() {
        return this.b.getF17492a();
    }

    @NotNull
    /* renamed from: _session, reason: from getter */
    public final BarcodeCountCaptureListSession getF17490a() {
        return this.f17490a;
    }

    public final int getTargetBarcodesQuantity$scandit_barcode_capture() {
        return getF17492a().getTargetBarcodesQuantity();
    }
}
