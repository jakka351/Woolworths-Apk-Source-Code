package com.woolworths.scanlibrary.ui.tap.tapon;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class TapOnFragment$bindTapOnListenerWithPermissionCheck$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.receiver
            r3 = r0
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment r3 = (com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment) r3
            com.woolworths.scanlibrary.util.beacon.BeaconScanner r0 = r3.i2()
            kotlin.Lazy r1 = r3.w
            com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner r0 = (com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner) r0
            java.lang.String r2 = r0.e
            if (r2 == 0) goto L1f
            int r0 = r2.length()
            if (r0 <= 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L29
        L1f:
            android.bluetooth.BluetoothAdapter r0 = r0.b
            if (r0 == 0) goto L28
            boolean r0 = r0.isEnabled()
            goto L1a
        L28:
            r0 = 0
        L29:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r2)
            r2 = 8000(0x1f40, float:1.121E-41)
            java.lang.String r4 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
            r5 = 31
            if (r0 != 0) goto L69
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L44
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            r3.startActivityForResult(r0, r2)
            goto La0
        L44:
            java.lang.Object r0 = r1.getD()
            com.woolworths.scanlibrary.util.permission.SngPermissionWrapper r0 = (com.woolworths.scanlibrary.util.permission.SngPermissionWrapper) r0
            java.lang.String[] r8 = r3.z
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBluetoothOnWithPermissionCheck$1 r1 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBluetoothOnWithPermissionCheck$1
            java.lang.String r6 = "requestBluetoothOn()V"
            r7 = 0
            r2 = 0
            java.lang.Class<com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment> r4 = com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.class
            java.lang.String r5 = "requestBluetoothOn"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = r1
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBluetoothOnWithPermissionCheck$2 r1 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBluetoothOnWithPermissionCheck$2
            java.lang.String r6 = "onBluetoothPermissionDenied()V"
            java.lang.Class<com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment> r4 = com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.class
            java.lang.String r5 = "onBluetoothPermissionDenied"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.d(r8, r9, r1)
            goto La0
        L69:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L71
            r3.p2()
            goto La0
        L71:
            if (r0 >= r5) goto L7c
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            r3.startActivityForResult(r0, r2)
            goto La0
        L7c:
            java.lang.Object r0 = r1.getD()
            com.woolworths.scanlibrary.util.permission.SngPermissionWrapper r0 = (com.woolworths.scanlibrary.util.permission.SngPermissionWrapper) r0
            java.lang.String[] r8 = r3.A
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBeaconScanningWithPermissionCheck$1 r1 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBeaconScanningWithPermissionCheck$1
            java.lang.String r6 = "startScan()V"
            r7 = 0
            r2 = 0
            java.lang.Class<com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment> r4 = com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.class
            java.lang.String r5 = "startScan"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = r1
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBeaconScanningWithPermissionCheck$2 r1 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$requestBeaconScanningWithPermissionCheck$2
            java.lang.String r6 = "onBluetoothPermissionDenied()V"
            java.lang.Class<com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment> r4 = com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.class
            java.lang.String r5 = "onBluetoothPermissionDenied"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.d(r8, r9, r1)
        La0:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$bindTapOnListenerWithPermissionCheck$1.invoke():java.lang.Object");
    }
}
