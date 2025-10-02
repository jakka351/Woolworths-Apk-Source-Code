package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewKt {
    public static final SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 a(View view) {
        return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new ViewKt$allViews$1(view, null));
    }

    public static final Sequence b(View view) {
        return SequencesKt.m(view.getParent(), ViewKt$ancestors$1.d);
    }
}
