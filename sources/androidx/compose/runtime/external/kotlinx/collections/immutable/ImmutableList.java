package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "SubList", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/AbstractList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {
        public final ImmutableList d;
        public final int e;
        public final int f;

        public SubList(ImmutableList immutableList, int i, int i2) {
            this.d = immutableList;
            this.e = i;
            ListImplementation.c(i, i2, immutableList.size());
            this.f = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final Object get(int i) {
            ListImplementation.a(i, this.f);
            return this.d.get(this.e + i);
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public final ImmutableList subList(int i, int i2) {
            ListImplementation.c(i, i2, this.f);
            int i3 = this.e;
            return new SubList(this.d, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    default ImmutableList subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
