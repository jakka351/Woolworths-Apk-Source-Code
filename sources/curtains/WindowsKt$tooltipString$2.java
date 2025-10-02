package curtains;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowsKt$tooltipString$2 extends Lambda implements Function0<String> {
    public static final WindowsKt$tooltipString$2 h = new WindowsKt$tooltipString$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", "android"));
        } catch (Resources.NotFoundException unused) {
            return "Tooltip";
        }
    }
}
