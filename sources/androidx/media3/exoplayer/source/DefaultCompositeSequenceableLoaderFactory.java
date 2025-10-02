package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.AbstractList;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public final CompositeSequenceableLoader a(ArrayList arrayList, AbstractList abstractList) {
        return new CompositeSequenceableLoader(arrayList, abstractList);
    }
}
