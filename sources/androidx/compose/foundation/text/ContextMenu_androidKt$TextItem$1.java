package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class ContextMenu_androidKt$TextItem$1 extends Lambda implements Function2<Composer, Integer, String> {
    public final /* synthetic */ TextContextMenuItems h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        super(2);
        this.h = textContextMenuItems;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(-1744780674);
        String strC = StringResources_androidKt.c(composer, this.h.d);
        composer.l();
        return strC;
    }
}
