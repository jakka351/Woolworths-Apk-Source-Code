package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/PointerIcon;", BarcodePickDeserializer.FIELD_ICON, "", "a", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PointerIcon;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsN {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsN f1947a = new AndroidComposeViewVerificationHelperMethodsN();

    public static PointerIcon b(Context context, androidx.compose.ui.input.pointer.PointerIcon pointerIcon) {
        if (pointerIcon instanceof AndroidPointerIcon) {
            return null;
        }
        return pointerIcon instanceof AndroidPointerIconType ? PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view, @Nullable androidx.compose.ui.input.pointer.PointerIcon icon) {
        PointerIcon pointerIconB = b(view.getContext(), icon);
        if (Intrinsics.c(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
