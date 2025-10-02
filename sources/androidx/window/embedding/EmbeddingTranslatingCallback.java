package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    @Override // java.util.function.Consumer
    public final void accept(List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList = list;
        Intrinsics.h(splitInfoList, "splitInfoList");
        throw null;
    }
}
