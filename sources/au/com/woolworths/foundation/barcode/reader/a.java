package au.com.woolworths.foundation.barcode.reader;

import androidx.camera.core.SettableImageProxy;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements OnFailureListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ SettableImageProxy e;

    public /* synthetic */ a(SettableImageProxy settableImageProxy, int i) {
        this.d = i;
        this.e = settableImageProxy;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception it) throws Exception {
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                Timber.f27013a.b(YU.a.A("Failed to read barcode exception: ", it.getMessage()), new Object[0]);
                this.e.close();
                break;
            default:
                Intrinsics.h(it, "it");
                Timber.f27013a.b(YU.a.A("[sng] Failed to read barcode exception: ", it.getMessage()), new Object[0]);
                this.e.close();
                break;
        }
    }
}
