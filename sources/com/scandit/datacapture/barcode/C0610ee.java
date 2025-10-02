package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.ee, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0610ee implements Zd {
    static final /* synthetic */ KProperty[] h = {Reflection.f24268a.e(new MutablePropertyReference1Impl(C0610ee.class, "showTorchButton", "getShowTorchButton()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final Context f17632a;
    private final BarcodeCountViewUiLayoutHelper b;
    private final BarcodeCountDataCaptureViewWrapper c;
    private final C0594de d;
    private Anchor e;
    private Set f;
    private final TorchSwitchControl g;

    public C0610ee(Context context, C0692k0 layoutHelper, D controlHandler) {
        Intrinsics.h(context, "context");
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(controlHandler, "controlHandler");
        this.f17632a = context;
        this.b = layoutHelper;
        this.c = controlHandler;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.d = new C0594de(Boolean.valueOf(barcodeCountViewDefaults.getShouldShowTorchControl()), this);
        this.e = barcodeCountViewDefaults.getTorchControlPosition();
        this.f = EmptySet.d;
        this.g = new TorchSwitchControl(context);
    }

    public final void a(boolean z) {
        this.d.setValue(this, h[0], Boolean.valueOf(z));
    }

    public final void b() {
        a();
    }

    public final void a(Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.e = anchor;
    }

    public final void a(Set set) {
        Intrinsics.h(set, "<set-?>");
        this.f = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        Anchor anchorRotate90DegreesCounterClockwise;
        PointWithUnit PointWithUnit;
        Anchor anchor;
        this.c.a(this.g);
        if (((Boolean) this.d.getValue(this, h[0])).booleanValue()) {
            boolean zA = AbstractC0682j6.a(this.f17632a);
            Anchor anchor2 = this.e;
            if (zA) {
                int i = AbstractC0526ae.f17380a[anchor2.ordinal()];
                if (i == 1) {
                    anchor = Anchor.TOP_LEFT;
                } else if (i == 2) {
                    anchor = Anchor.BOTTOM_LEFT;
                } else if (i == 3) {
                    anchor = Anchor.TOP_RIGHT;
                } else if (i != 4) {
                    anchor = Anchor.TOP_LEFT;
                } else {
                    anchor = Anchor.BOTTOM_RIGHT;
                }
                anchorRotate90DegreesCounterClockwise = AnchorExtensionsKt.rotate90DegreesCounterClockwise(anchor);
            } else {
                int i2 = AbstractC0526ae.f17380a[anchor2.ordinal()];
                if (i2 == 1) {
                    anchorRotate90DegreesCounterClockwise = Anchor.TOP_LEFT;
                } else if (i2 == 2) {
                    anchorRotate90DegreesCounterClockwise = Anchor.BOTTOM_LEFT;
                } else if (i2 == 3) {
                    anchorRotate90DegreesCounterClockwise = Anchor.TOP_RIGHT;
                } else if (i2 != 4) {
                    anchorRotate90DegreesCounterClockwise = Anchor.TOP_LEFT;
                } else {
                    anchorRotate90DegreesCounterClockwise = Anchor.BOTTOM_RIGHT;
                }
            }
            if (zA) {
                C0542be c0542be = new C0542be(this);
                int i3 = AbstractC0526ae.f17380a[anchorRotate90DegreesCounterClockwise.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(H.i(), H.h() + this.b.f(), MeasureUnit.PIXEL);
                } else if (i3 == 3) {
                    PointWithUnit = (PointWithUnit) c0542be.invoke(Boolean.valueOf(this.f.contains(Anchor.BOTTOM_RIGHT)));
                } else if (i3 == 4) {
                    PointWithUnit = (PointWithUnit) c0542be.invoke(Boolean.valueOf(this.f.contains(Anchor.BOTTOM_LEFT)));
                } else {
                    throw new IllegalStateException("Unsupported anchor");
                }
            } else {
                C0578ce c0578ce = new C0578ce(this);
                int i4 = AbstractC0526ae.f17380a[anchorRotate90DegreesCounterClockwise.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException(("Unreachable anchor " + anchorRotate90DegreesCounterClockwise).toString());
                            }
                        }
                        PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(H.j(), H.j(), MeasureUnit.PIXEL);
                    }
                    PointWithUnit = (PointWithUnit) c0578ce.invoke(Boolean.valueOf(this.f.contains(anchorRotate90DegreesCounterClockwise)));
                } else {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(H.j(), H.j(), MeasureUnit.PIXEL);
                }
            }
            this.c.a(this.g, anchorRotate90DegreesCounterClockwise, PointWithUnit);
        }
    }
}
