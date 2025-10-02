package androidx.compose.runtime.saveable;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SaveableHolder$valueProvider$1 extends Lambda implements Function0<Object> {
    public final /* synthetic */ SaveableHolder h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableHolder$valueProvider$1(SaveableHolder saveableHolder) {
        super(0);
        this.h = saveableHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SaveableHolder saveableHolder = this.h;
        Saver saver = saveableHolder.d;
        Object obj = saveableHolder.g;
        if (obj != null) {
            return saver.a(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }
}
