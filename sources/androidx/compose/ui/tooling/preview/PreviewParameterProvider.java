package androidx.compose.ui.tooling.preview;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    default int getCount() {
        return SequencesKt.d(getValues());
    }

    Sequence getValues();
}
