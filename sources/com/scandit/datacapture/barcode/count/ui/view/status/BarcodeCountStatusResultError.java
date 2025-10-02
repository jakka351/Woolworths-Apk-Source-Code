package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResultError;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultError;", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStatusResultError {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultError$Companion;", "", "", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "statusList", "", "errorMessage", "statusModeDisabledMessage", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountStatusResult create(@NotNull List<BarcodeCountStatusItem> statusList, @Nullable String errorMessage, @Nullable String statusModeDisabledMessage) {
            Intrinsics.h(statusList, "statusList");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(statusList, 10));
            Iterator<T> it = statusList.iterator();
            while (it.hasNext()) {
                arrayList.add(((BarcodeCountStatusItem) it.next()).getF17583a());
            }
            NativeBarcodeCountStatusResult nativeBarcodeCountStatusResultCreate = NativeBarcodeCountStatusResultError.create(CollectionsExtensionsKt.toArrayList(arrayList), errorMessage, statusModeDisabledMessage);
            Intrinsics.g(nativeBarcodeCountStatusResultCreate, "create(\n                …essage,\n                )");
            return new BarcodeCountStatusResult(nativeBarcodeCountStatusResultCreate);
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountStatusResult create(@NotNull List<BarcodeCountStatusItem> list, @Nullable String str, @Nullable String str2) {
        return INSTANCE.create(list, str, str2);
    }
}
