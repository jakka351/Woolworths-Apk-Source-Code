package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "CacheRecord", "MeasureInputs", "NonMeasureInputs", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public CacheRecord d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheRecord extends StateRecord {
        public CharSequence c;
        public List d;
        public TextRange e;
        public TextStyle f;
        public boolean g;
        public boolean h;
        public float i;
        public float j;
        public LayoutDirection k;
        public FontFamily.Resolver l;
        public long m;
        public TextLayoutResult n;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.c = cacheRecord.c;
            this.d = cacheRecord.d;
            this.e = cacheRecord.e;
            this.f = cacheRecord.f;
            this.g = cacheRecord.g;
            this.h = cacheRecord.h;
            this.i = cacheRecord.i;
            this.j = cacheRecord.j;
            this.k = cacheRecord.k;
            this.l = cacheRecord.l;
            this.m = cacheRecord.m;
            this.n = cacheRecord.n;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            CacheRecord cacheRecord = new CacheRecord(SnapshotKt.k().getB());
            cacheRecord.i = Float.NaN;
            cacheRecord.j = Float.NaN;
            cacheRecord.m = ConstraintsKt.b(0, 0, 15);
            return cacheRecord;
        }

        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.c) + ", composingAnnotations=" + this.d + ", composition=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", softWrap=" + this.h + ", densityValue=" + this.i + ", fontScale=" + this.j + ", layoutDirection=" + this.k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) Constraints.l(this.m)) + ", layoutResult=" + this.n + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MeasureInputs {

        /* renamed from: a, reason: collision with root package name */
        public final MeasureScope f1173a;
        public final LayoutDirection b;
        public final FontFamily.Resolver c;
        public final long d;
        public final float e;
        public final float f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public MeasureInputs(MeasureScope measureScope, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
            this.f1173a = measureScope;
            this.b = layoutDirection;
            this.c = resolver;
            this.d = j;
            this.e = measureScope.getD();
            this.f = measureScope.getE();
        }

        public final String toString() {
            return "MeasureInputs(density=" + this.f1173a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + ((Object) Constraints.l(this.d)) + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NonMeasureInputs {

        /* renamed from: a, reason: collision with root package name */
        public final TransformedTextFieldState f1174a;
        public final TextStyle b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, boolean z3) {
            this.f1174a = transformedTextFieldState;
            this.b = textStyle;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb.append(this.f1174a);
            sb.append(", textStyle=");
            sb.append(this.b);
            sb.append(", singleLine=");
            sb.append(this.c);
            sb.append(", softWrap=");
            sb.append(this.d);
            sb.append(", isKeyboardTypePhone=");
            return androidx.camera.core.impl.b.s(sb, this.e, ')');
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.d = (CacheRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord o(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.d;
    }
}
