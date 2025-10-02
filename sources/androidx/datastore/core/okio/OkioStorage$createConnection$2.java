package androidx.datastore.core.okio;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Path;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class OkioStorage$createConnection$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ OkioStorage h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$createConnection$2(OkioStorage okioStorage) {
        super(0);
        this.h = okioStorage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Synchronizer synchronizer = OkioStorage.g;
        OkioStorage okioStorage = this.h;
        synchronized (synchronizer) {
            OkioStorage.f.remove(((Path) okioStorage.e.getD()).d.y());
        }
        return Unit.f24250a;
    }
}
