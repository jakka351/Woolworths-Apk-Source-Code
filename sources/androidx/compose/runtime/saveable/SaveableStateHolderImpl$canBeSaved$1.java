package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaveableStateHolderImpl$canBeSaved$1 extends Lambda implements Function1<Object, Boolean> {
    public final /* synthetic */ SaveableStateHolderImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$canBeSaved$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.h = saveableStateHolderImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.h.c;
        return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.a(obj) : true);
    }
}
