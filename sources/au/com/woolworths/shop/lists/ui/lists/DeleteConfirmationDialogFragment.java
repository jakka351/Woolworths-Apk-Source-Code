package au.com.woolworths.shop.lists.ui.lists;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.lists.DeleteConfirmationDialogFragment;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/DeleteConfirmationDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeleteConfirmationDialogFragment extends DialogFragment {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/DeleteConfirmationDialogFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_LIST_INFO", "ActionType", "ListInfo", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/DeleteConfirmationDialogFragment$Companion$ActionType;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ActionType {
            public static final ActionType d;
            public static final ActionType e;
            public static final /* synthetic */ ActionType[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                ActionType actionType = new ActionType("DELETE_LIST", 0);
                d = actionType;
                ActionType actionType2 = new ActionType("REMOVE_ALL_ITEMS", 1);
                e = actionType2;
                ActionType[] actionTypeArr = {actionType, actionType2};
                f = actionTypeArr;
                g = EnumEntriesKt.a(actionTypeArr);
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) f.clone();
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/DeleteConfirmationDialogFragment$Companion$ListInfo;", "Landroid/os/Parcelable;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ListInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ListInfo> CREATOR = new Creator();
            public final String d;
            public final Text e;
            public final Text f;
            public final int g;
            public final ActionType h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ListInfo> {
                @Override // android.os.Parcelable.Creator
                public final ListInfo createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ListInfo(parcel.readString(), (Text) parcel.readParcelable(ListInfo.class.getClassLoader()), (Text) parcel.readParcelable(ListInfo.class.getClassLoader()), parcel.readInt(), ActionType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ListInfo[] newArray(int i) {
                    return new ListInfo[i];
                }
            }

            public ListInfo(String id, Text dialogTitle, Text message, int i, ActionType actionType) {
                Intrinsics.h(id, "id");
                Intrinsics.h(dialogTitle, "dialogTitle");
                Intrinsics.h(message, "message");
                Intrinsics.h(actionType, "actionType");
                this.d = id;
                this.e = dialogTitle;
                this.f = message;
                this.g = i;
                this.h = actionType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ListInfo)) {
                    return false;
                }
                ListInfo listInfo = (ListInfo) obj;
                return Intrinsics.c(this.d, listInfo.d) && Intrinsics.c(this.e, listInfo.e) && Intrinsics.c(this.f, listInfo.f) && this.g == listInfo.g && this.h == listInfo.h;
            }

            public final int hashCode() {
                return this.h.hashCode() + b.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31);
            }

            public final String toString() {
                return "ListInfo(id=" + this.d + ", dialogTitle=" + this.e + ", message=" + this.f + ", dialogPositiveButton=" + this.g + ", actionType=" + this.h + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeParcelable(this.e, i);
                dest.writeParcelable(this.f, i);
                dest.writeInt(this.g);
                dest.writeString(this.h.name());
            }
        }

        public static DeleteConfirmationDialogFragment a(ShoppingList list) {
            Intrinsics.h(list, "list");
            ResText resText = new ResText(R.string.shop_lists_delete_list_title);
            ResWithArgText resWithArgText = new ResWithArgText(R.string.shop_lists_delete_list_message, list.getTitle());
            DeleteConfirmationDialogFragment deleteConfirmationDialogFragment = new DeleteConfirmationDialogFragment();
            deleteConfirmationDialogFragment.setCancelable(false);
            deleteConfirmationDialogFragment.setArguments(BundleKt.a(new Pair("list_info", new ListInfo(list.getId(), resText, resWithArgText, R.string.shop_lists_button_delete, ActionType.d))));
            return deleteConfirmationDialogFragment;
        }

        public static DeleteConfirmationDialogFragment b(ShoppingList list) {
            Intrinsics.h(list, "list");
            ResWithArgText resWithArgText = new ResWithArgText(R.string.shop_lists_remove_all_title, list.getTitle());
            ResText resText = new ResText(R.string.shop_lists_remove_all_message);
            DeleteConfirmationDialogFragment deleteConfirmationDialogFragment = new DeleteConfirmationDialogFragment();
            deleteConfirmationDialogFragment.setCancelable(false);
            deleteConfirmationDialogFragment.setArguments(BundleKt.a(new Pair("list_info", new ListInfo(list.getId(), resWithArgText, resText, R.string.shop_lists_button_remove_all, ActionType.e))));
            return deleteConfirmationDialogFragment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Companion.ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Companion.ActionType actionType = Companion.ActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        final Companion.ListInfo listInfo = (Companion.ListInfo) requireArguments().getParcelable("list_info");
        if (listInfo == null) {
            throw new IllegalArgumentException("ListInfo cannot be null!");
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        Text text = listInfo.e;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        AlertDialog.Builder title = builder.setTitle(text.getText(contextRequireContext));
        Text text2 = listInfo.f;
        Context contextRequireContext2 = requireContext();
        Intrinsics.g(contextRequireContext2, "requireContext(...)");
        final int i = 0;
        AlertDialog.Builder positiveButton = title.setMessage(text2.getText(contextRequireContext2)).setPositiveButton(listInfo.g, new DialogInterface.OnClickListener(this) { // from class: au.com.woolworths.shop.lists.ui.lists.a
            public final /* synthetic */ DeleteConfirmationDialogFragment e;

            {
                this.e = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DeleteListDialogListener deleteListDialogListener;
                DeleteListDialogListener deleteListDialogListener2;
                DeleteListDialogListener deleteListDialogListener3;
                DeleteListDialogListener deleteListDialogListener4;
                switch (i) {
                    case 0:
                        DeleteConfirmationDialogFragment.Companion.ListInfo listInfo2 = listInfo;
                        String str = listInfo2.d;
                        int iOrdinal = listInfo2.h.ordinal();
                        DeleteConfirmationDialogFragment deleteConfirmationDialogFragment = this.e;
                        if (iOrdinal == 0) {
                            ActivityResultCaller parentFragment = deleteConfirmationDialogFragment.getParentFragment();
                            if (parentFragment != null) {
                                deleteListDialogListener = (DeleteListDialogListener) parentFragment;
                            } else {
                                KeyEventDispatcher.Component activity = deleteConfirmationDialogFragment.getActivity();
                                if (activity == null) {
                                    throw new IllegalStateException("DeleteListDialogListener not found");
                                }
                                deleteListDialogListener = (DeleteListDialogListener) activity;
                            }
                            deleteListDialogListener.D(str, true);
                            return;
                        }
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityResultCaller parentFragment2 = deleteConfirmationDialogFragment.getParentFragment();
                        if (parentFragment2 != null) {
                            deleteListDialogListener2 = (DeleteListDialogListener) parentFragment2;
                        } else {
                            KeyEventDispatcher.Component activity2 = deleteConfirmationDialogFragment.getActivity();
                            if (activity2 == null) {
                                throw new IllegalStateException("DeleteListDialogListener not found");
                            }
                            deleteListDialogListener2 = (DeleteListDialogListener) activity2;
                        }
                        deleteListDialogListener2.i(str, true);
                        return;
                    default:
                        DeleteConfirmationDialogFragment.Companion.ListInfo listInfo3 = listInfo;
                        String str2 = listInfo3.d;
                        int iOrdinal2 = listInfo3.h.ordinal();
                        DeleteConfirmationDialogFragment deleteConfirmationDialogFragment2 = this.e;
                        if (iOrdinal2 == 0) {
                            ActivityResultCaller parentFragment3 = deleteConfirmationDialogFragment2.getParentFragment();
                            if (parentFragment3 != null) {
                                deleteListDialogListener3 = (DeleteListDialogListener) parentFragment3;
                            } else {
                                KeyEventDispatcher.Component activity3 = deleteConfirmationDialogFragment2.getActivity();
                                if (activity3 == null) {
                                    throw new IllegalStateException("DeleteListDialogListener not found");
                                }
                                deleteListDialogListener3 = (DeleteListDialogListener) activity3;
                            }
                            deleteListDialogListener3.D(str2, false);
                            return;
                        }
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityResultCaller parentFragment4 = deleteConfirmationDialogFragment2.getParentFragment();
                        if (parentFragment4 != null) {
                            deleteListDialogListener4 = (DeleteListDialogListener) parentFragment4;
                        } else {
                            KeyEventDispatcher.Component activity4 = deleteConfirmationDialogFragment2.getActivity();
                            if (activity4 == null) {
                                throw new IllegalStateException("DeleteListDialogListener not found");
                            }
                            deleteListDialogListener4 = (DeleteListDialogListener) activity4;
                        }
                        deleteListDialogListener4.i(str2, false);
                        return;
                }
            }
        });
        final int i2 = 1;
        AlertDialog alertDialogCreate = positiveButton.setNegativeButton(R.string.shop_lists_button_cancel, new DialogInterface.OnClickListener(this) { // from class: au.com.woolworths.shop.lists.ui.lists.a
            public final /* synthetic */ DeleteConfirmationDialogFragment e;

            {
                this.e = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                DeleteListDialogListener deleteListDialogListener;
                DeleteListDialogListener deleteListDialogListener2;
                DeleteListDialogListener deleteListDialogListener3;
                DeleteListDialogListener deleteListDialogListener4;
                switch (i2) {
                    case 0:
                        DeleteConfirmationDialogFragment.Companion.ListInfo listInfo2 = listInfo;
                        String str = listInfo2.d;
                        int iOrdinal = listInfo2.h.ordinal();
                        DeleteConfirmationDialogFragment deleteConfirmationDialogFragment = this.e;
                        if (iOrdinal == 0) {
                            ActivityResultCaller parentFragment = deleteConfirmationDialogFragment.getParentFragment();
                            if (parentFragment != null) {
                                deleteListDialogListener = (DeleteListDialogListener) parentFragment;
                            } else {
                                KeyEventDispatcher.Component activity = deleteConfirmationDialogFragment.getActivity();
                                if (activity == null) {
                                    throw new IllegalStateException("DeleteListDialogListener not found");
                                }
                                deleteListDialogListener = (DeleteListDialogListener) activity;
                            }
                            deleteListDialogListener.D(str, true);
                            return;
                        }
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityResultCaller parentFragment2 = deleteConfirmationDialogFragment.getParentFragment();
                        if (parentFragment2 != null) {
                            deleteListDialogListener2 = (DeleteListDialogListener) parentFragment2;
                        } else {
                            KeyEventDispatcher.Component activity2 = deleteConfirmationDialogFragment.getActivity();
                            if (activity2 == null) {
                                throw new IllegalStateException("DeleteListDialogListener not found");
                            }
                            deleteListDialogListener2 = (DeleteListDialogListener) activity2;
                        }
                        deleteListDialogListener2.i(str, true);
                        return;
                    default:
                        DeleteConfirmationDialogFragment.Companion.ListInfo listInfo3 = listInfo;
                        String str2 = listInfo3.d;
                        int iOrdinal2 = listInfo3.h.ordinal();
                        DeleteConfirmationDialogFragment deleteConfirmationDialogFragment2 = this.e;
                        if (iOrdinal2 == 0) {
                            ActivityResultCaller parentFragment3 = deleteConfirmationDialogFragment2.getParentFragment();
                            if (parentFragment3 != null) {
                                deleteListDialogListener3 = (DeleteListDialogListener) parentFragment3;
                            } else {
                                KeyEventDispatcher.Component activity3 = deleteConfirmationDialogFragment2.getActivity();
                                if (activity3 == null) {
                                    throw new IllegalStateException("DeleteListDialogListener not found");
                                }
                                deleteListDialogListener3 = (DeleteListDialogListener) activity3;
                            }
                            deleteListDialogListener3.D(str2, false);
                            return;
                        }
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityResultCaller parentFragment4 = deleteConfirmationDialogFragment2.getParentFragment();
                        if (parentFragment4 != null) {
                            deleteListDialogListener4 = (DeleteListDialogListener) parentFragment4;
                        } else {
                            KeyEventDispatcher.Component activity4 = deleteConfirmationDialogFragment2.getActivity();
                            if (activity4 == null) {
                                throw new IllegalStateException("DeleteListDialogListener not found");
                            }
                            deleteListDialogListener4 = (DeleteListDialogListener) activity4;
                        }
                        deleteListDialogListener4.i(str2, false);
                        return;
                }
            }
        }).create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
