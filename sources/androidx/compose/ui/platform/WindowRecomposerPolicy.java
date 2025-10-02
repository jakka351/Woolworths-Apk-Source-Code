package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.platform.WindowRecomposerFactory;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeUiApi
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f1990a = new AtomicReference(WindowRecomposerFactory.Companion.f1989a);
}
