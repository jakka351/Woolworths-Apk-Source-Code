package com.woolworths.scanlibrary.util.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RecyclerAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public List g;
    public final int h;
    public final Class i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter$Companion;", "", "", "TAG", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RecyclerAdapter(List snapshots, int i, Class cls) {
        Intrinsics.h(snapshots, "snapshots");
        this.g = snapshots;
        this.h = i;
        this.i = cls;
    }

    public abstract void G(RecyclerView.ViewHolder viewHolder, Object obj, int i);

    public final void H(List snapshots) {
        Intrinsics.h(snapshots, "snapshots");
        this.g = snapshots;
        l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int k(int i) {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        G(viewHolder, this.g.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            T tNewInstance = this.i.getConstructor(View.class).newInstance(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
            Intrinsics.g(tNewInstance, "newInstance(...)");
            return (RecyclerView.ViewHolder) tNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
