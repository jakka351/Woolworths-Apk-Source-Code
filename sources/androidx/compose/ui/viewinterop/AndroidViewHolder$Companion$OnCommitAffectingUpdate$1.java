package androidx.compose.ui.viewinterop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements Function1<AndroidViewHolder, Unit> {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 h = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
        androidViewHolder.getHandler().post(new a(1, androidViewHolder.t));
        return Unit.f24250a;
    }
}
