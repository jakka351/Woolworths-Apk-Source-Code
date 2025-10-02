package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class MenuBuilder implements SupportMenu {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f134a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public Callback e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public MenuItemImpl w;
    public boolean y;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public final ArrayList u = new ArrayList();
    public final CopyOnWriteArrayList v = new CopyOnWriteArrayList();
    public boolean x = false;

    @RestrictTo
    /* loaded from: classes.dex */
    public interface Callback {
        boolean a(MenuBuilder menuBuilder, MenuItem menuItem);

        void b(MenuBuilder menuBuilder);
    }

    @RestrictTo
    public interface ItemInvoker {
        boolean d(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        boolean z2 = false;
        this.f134a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z2 = true;
        }
        this.d = z2;
    }

    public final void A() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    public final void B() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    public MenuItemImpl a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (z[i5] << 16) | (65535 & i3);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((MenuItemImpl) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, menuItemImpl);
        q(true);
        return menuItemImpl;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f134a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemImpl menuItemImplA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemImplA.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemImplA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = menuItemImplA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(MenuPresenter menuPresenter) {
        c(menuPresenter, this.f134a);
    }

    public final void c(MenuPresenter menuPresenter, Context context) {
        this.v.add(new WeakReference(menuPresenter));
        menuPresenter.h(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemImpl menuItemImpl = this.w;
        if (menuItemImpl != null) {
            e(menuItemImpl);
        }
        this.f.clear();
        q(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z2) {
        if (this.t) {
            return;
        }
        this.t = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.c(this, z2);
            }
        }
        this.t = false;
    }

    public boolean e(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.w == menuItemImpl) {
            B();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK = menuPresenter.k(menuItemImpl);
                    if (zK) {
                        break;
                    }
                }
            }
            A();
            if (zK) {
                this.w = null;
            }
        }
        return zK;
    }

    public boolean f(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.e;
        return callback != null && callback.a(menuBuilder, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.f135a == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zE = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        B();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zE = menuPresenter.e(menuItemImpl);
                if (zE) {
                    break;
                }
            }
        }
        A();
        if (zE) {
            this.w = menuItemImpl;
        }
        return zE;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final MenuItemImpl h(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.u;
        arrayList.clear();
        i(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean zO = o();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            char c = zO ? menuItemImpl.j : menuItemImpl.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zO && c == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemImpl) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(List list, int i, KeyEvent keyEvent) {
        boolean zO = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    menuItemImpl.o.i(list, i, keyEvent);
                }
                char c = zO ? menuItemImpl.j : menuItemImpl.h;
                if ((modifiers & 69647) == ((zO ? menuItemImpl.k : menuItemImpl.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zO && c == '\b' && i == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return h(i, keyEvent) != null;
    }

    public final void j() {
        ArrayList arrayListM = m();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.v;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= menuPresenter.g();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListM.get(i);
                    if ((menuItemImpl.x & 32) == 32) {
                        arrayList.add(menuItemImpl);
                    } else {
                        arrayList2.add(menuItemImpl);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m());
            }
            this.k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public MenuBuilder l() {
        return this;
    }

    public final ArrayList m() {
        boolean z2 = this.h;
        ArrayList arrayList = this.g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList2.get(i);
            if (menuItemImpl.isVisible()) {
                arrayList.add(menuItemImpl);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean n() {
        return this.x;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return this.d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return r(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl menuItemImplH = h(i, keyEvent);
        boolean zR = menuItemImplH != null ? r(menuItemImplH, null, i2) : false;
        if ((i2 & 2) != 0) {
            d(true);
        }
        return zR;
    }

    public void q(boolean z2) {
        if (this.p) {
            this.q = true;
            if (z2) {
                this.r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        B();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.f(z2);
            }
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MenuItem r7, androidx.appcompat.view.menu.MenuPresenter r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.MenuItemImpl r7 = (androidx.appcompat.view.menu.MenuItemImpl) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            androidx.appcompat.view.menu.MenuBuilder r1 = r7.n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L41
        L1c:
            boolean r2 = r1.f(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f134a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            androidx.core.view.ActionProvider r1 = r7.A
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
            goto L1a
        L40:
            r1 = r0
        L41:
            androidx.core.view.ActionProvider r2 = r7.A
            if (r2 == 0) goto L4d
            boolean r4 = r2.a()
            if (r4 == 0) goto L4d
            r4 = r3
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.d(r3)
            goto Lcb
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L69
            goto L71
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.d(r3)
            goto Lcb
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.d(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            androidx.appcompat.view.menu.SubMenuBuilder r9 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r5 = r6.f134a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L8c:
            androidx.appcompat.view.menu.SubMenuBuilder r7 = r7.o
            if (r4 == 0) goto L93
            r2.f(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.v
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.m(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r4 = (androidx.appcompat.view.menu.MenuPresenter) r4
            if (r4 != 0) goto Lbe
            r9.remove(r2)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.m(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.d(r3)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.r(android.view.MenuItem, androidx.appcompat.view.menu.MenuPresenter, int):boolean");
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((MenuItemImpl) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemImpl) arrayList.get(i2)).f135a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        q(true);
    }

    public final void s(MenuPresenter menuPresenter) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                menuItemImpl.f(z3);
                menuItemImpl.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                menuItemImpl.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.b == i) {
                int i3 = menuItemImpl.x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                menuItemImpl.x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.c = z2;
        q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).t(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void u(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.v;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = menuPresenter.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        menuPresenter.l(parcelable);
                    }
                }
            }
        }
    }

    public final void v(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public final void w(Bundle bundle) {
        Parcelable parcelableD;
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelableD = menuPresenter.d()) != null) {
                    sparseArray.put(id, parcelableD);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void x(Callback callback) {
        this.e = callback;
    }

    public final void y(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.f134a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public final void z(boolean z2) {
        this.y = z2;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImplA = a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f134a, this, menuItemImplA);
        menuItemImplA.o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(menuItemImplA.e);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
