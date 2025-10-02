package com.woolworths.scanlibrary.ui.scanner;

import android.content.Intent;
import androidx.core.os.BundleKt;
import com.woolworths.scanlibrary.ui.message.MessageActivity;
import com.woolworths.scanlibrary.ui.message.Messages;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ScannerActivityOld$startScannerWithPermissionCheck$2 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ScannerActivityOld scannerActivityOld = (ScannerActivityOld) this.receiver;
        boolean z = false;
        scannerActivityOld.M = false;
        if (scannerActivityOld.N) {
            scannerActivityOld.runOnUiThread(new androidx.camera.camera2.interop.b(z, scannerActivityOld));
            scannerActivityOld.overridePendingTransition(0, 0);
            scannerActivityOld.finish();
        } else {
            scannerActivityOld.N = true;
            Messages.Companion companion = Messages.h;
            Pair[] pairArr = {new Pair("messageName", "CAMERA_PERMISSION_NOT_GRANTED")};
            Intent intent = new Intent(scannerActivityOld, (Class<?>) MessageActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            scannerActivityOld.startActivity(intent);
        }
        return Unit.f24250a;
    }
}
