package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LongSparseArray;

/* loaded from: classes4.dex */
class ViewHolderState extends LongSparseArray<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new AnonymousClass1();

    /* renamed from: com.airbnb.epoxy.ViewHolderState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ViewHolderState> {
        @Override // android.os.Parcelable.Creator
        public final ViewHolderState createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(i);
            for (int i2 = 0; i2 < i; i2++) {
                viewHolderState.h(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        @Override // android.os.Parcelable.Creator
        public final ViewHolderState[] newArray(int i) {
            return new ViewHolderState[i];
        }
    }

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new AnonymousClass1();

        /* renamed from: com.airbnb.epoxy.ViewHolderState$ViewState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<ViewState> {
            public static ViewState a(Parcel parcel, ClassLoader classLoader) {
                int i = parcel.readInt();
                int[] iArr = new int[i];
                parcel.readIntArray(iArr);
                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
                ViewState viewState = new ViewState(i);
                for (int i2 = 0; i2 < i; i2++) {
                    viewState.put(iArr[i2], parcelableArray[i2]);
                }
                return viewState;
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* bridge */ /* synthetic */ ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return a(parcel, null);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void m(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.c();
        if (epoxyViewHolder.f13318a.y()) {
            ViewState viewState = (ViewState) c(epoxyViewHolder.getItemId());
            if (viewState == null) {
                viewState = new ViewState();
            }
            View view = epoxyViewHolder.itemView;
            int id = view.getId();
            if (view.getId() == -1) {
                view.setId(com.woolworths.R.id.view_model_state_saving_id);
            }
            view.saveHierarchyState(viewState);
            view.setId(id);
            h(epoxyViewHolder.getItemId(), viewState);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j();
        parcel.writeInt(iJ);
        for (int i2 = 0; i2 < iJ; i2++) {
            parcel.writeLong(g(i2));
            parcel.writeParcelable((Parcelable) k(i2), 0);
        }
    }
}
