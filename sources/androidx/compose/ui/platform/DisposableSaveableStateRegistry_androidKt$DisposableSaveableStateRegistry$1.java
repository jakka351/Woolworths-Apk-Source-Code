package androidx.compose.ui.platform;

import androidx.os.SavedStateRegistry;
import androidx.os.internal.SavedStateRegistryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SavedStateRegistry i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.h = z;
        this.i = savedStateRegistry;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.h) {
            SavedStateRegistry savedStateRegistry = this.i;
            String str = this.j;
            SavedStateRegistryImpl savedStateRegistryImpl = savedStateRegistry.f3731a;
            synchronized (savedStateRegistryImpl.c) {
            }
        }
        return Unit.f24250a;
    }
}
