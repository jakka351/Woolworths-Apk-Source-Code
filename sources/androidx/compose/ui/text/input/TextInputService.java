package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class TextInputService {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTextInputService f2128a;
    public final AtomicReference b = new AtomicReference(null);

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.f2128a = platformTextInputService;
    }
}
