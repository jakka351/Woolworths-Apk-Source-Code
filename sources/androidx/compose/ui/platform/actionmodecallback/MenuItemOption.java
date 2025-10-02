package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MenuItemOption {
    public static final MenuItemOption f;
    public static final MenuItemOption g;
    public static final MenuItemOption h;
    public static final MenuItemOption i;
    public static final MenuItemOption j;
    public static final /* synthetic */ MenuItemOption[] k;
    public static final /* synthetic */ EnumEntries l;
    public final int d;
    public final int e;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuItemOption menuItemOption = MenuItemOption.f;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuItemOption menuItemOption2 = MenuItemOption.f;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuItemOption menuItemOption3 = MenuItemOption.f;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuItemOption menuItemOption4 = MenuItemOption.f;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        MenuItemOption menuItemOption = new MenuItemOption("Copy", 0, 0);
        f = menuItemOption;
        MenuItemOption menuItemOption2 = new MenuItemOption("Paste", 1, 1);
        g = menuItemOption2;
        MenuItemOption menuItemOption3 = new MenuItemOption("Cut", 2, 2);
        h = menuItemOption3;
        MenuItemOption menuItemOption4 = new MenuItemOption("SelectAll", 3, 3);
        i = menuItemOption4;
        MenuItemOption menuItemOption5 = new MenuItemOption("Autofill", 4, 4);
        j = menuItemOption5;
        MenuItemOption[] menuItemOptionArr = {menuItemOption, menuItemOption2, menuItemOption3, menuItemOption4, menuItemOption5};
        k = menuItemOptionArr;
        l = EnumEntriesKt.a(menuItemOptionArr);
    }

    public MenuItemOption(String str, int i2, int i3) {
        this.d = i3;
        this.e = i3;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) k.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final int b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.copy;
        }
        if (iOrdinal == 1) {
            return R.string.paste;
        }
        if (iOrdinal == 2) {
            return R.string.cut;
        }
        if (iOrdinal == 3) {
            return R.string.selectAll;
        }
        if (iOrdinal == 4) {
            return R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: getOrder, reason: from getter */
    public final int getE() {
        return this.e;
    }
}
