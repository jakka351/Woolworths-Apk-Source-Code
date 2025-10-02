package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextInputSession {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputService f2131a;
    public final PlatformTextInputService b;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.f2131a = textInputService;
        this.b = platformTextInputService;
    }
}
