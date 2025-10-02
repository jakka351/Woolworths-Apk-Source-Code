package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TypefaceResult extends State<Object> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Async implements TypefaceResult, State<Object> {
        public final AsyncFontListLoader d;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.d = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        /* renamed from: g */
        public final boolean getE() {
            return this.d.j;
        }

        @Override // androidx.compose.runtime.State
        /* renamed from: getValue */
        public final Object getD() {
            return this.d.getD();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Immutable implements TypefaceResult {
        public final Object d;
        public final boolean e;

        public Immutable(Object obj, boolean z) {
            this.d = obj;
            this.e = z;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        /* renamed from: g, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // androidx.compose.runtime.State
        /* renamed from: getValue, reason: from getter */
        public final Object getD() {
            return this.d;
        }
    }

    /* renamed from: g */
    boolean getE();
}
