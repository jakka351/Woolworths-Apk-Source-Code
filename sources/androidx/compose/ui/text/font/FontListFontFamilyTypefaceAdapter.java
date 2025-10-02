package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.DispatcherKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1 c = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d);

    /* renamed from: a, reason: collision with root package name */
    public final AsyncTypefaceCache f2097a;
    public final ContextScope b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache) {
        this.f2097a = asyncTypefaceCache;
        MainCoroutineDispatcher mainCoroutineDispatcher = DispatcherKt.f2143a;
        FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1 fontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1 = c;
        fontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1.getClass();
        this.b = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(fontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1, mainCoroutineDispatcher).plus(EmptyCoroutineContext.d).plus(SupervisorKt.a(null)));
    }
}
