package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class l6 extends h1<ResourceContract> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16583a = "ResourceData";

    public class a extends HashMap<String, String> {
        public a() {
            put("formId", "TEXT");
            put("remoteUrl", "TEXT");
            put("localUrl", "TEXT");
            put("checksum", "TEXT");
            put("isGlobal", "INTEGER");
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16585a = "formId";
        private static final String b = "remoteUrl";
        private static final String c = "localUrl";
        private static final String d = "checksum";
        private static final String e = "isGlobal";

        private b() {
        }
    }

    private ResourceContract a(Cursor cursor, boolean z) {
        return new ResourceContract(cursor.getString(cursor.getColumnIndex("formId")), l3.a(cursor.getString(cursor.getColumnIndex("remoteUrl")), z), l3.a(cursor.getString(cursor.getColumnIndex("localUrl")), z), cursor.getString(cursor.getColumnIndex("checksum")), cursor.getInt(cursor.getColumnIndex("isGlobal")) == 1);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16583a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<ResourceContract> c(Object... objArr) {
        Cursor cursorQuery;
        if (objArr == null || objArr.length <= 0) {
            cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        } else {
            Object obj = objArr[0];
            if (obj == null || !(obj instanceof Boolean)) {
                return null;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            cursorQuery = f1.a().getReadableDatabase().rawQuery("select * from '" + d() + "' where isGlobal=?", new String[]{String.valueOf(zBooleanValue ? 1 : 0)});
        }
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(a(cursorQuery, false));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ResourceContract b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String)) {
            String str = (String) obj;
            if (objArr.length == 1) {
                cursorQuery = f1.a().getReadableDatabase().query(d(), null, "remoteUrl=?", new String[]{l3.a(str, true)}, null, null, null);
            } else if (objArr.length == 2) {
                Object obj2 = objArr[1];
                if (obj2 == null || !(obj2 instanceof String)) {
                    return null;
                }
                cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=? AND remoteUrl=?", new String[]{(String) obj2, l3.a(str, true)}, null, null, null);
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                resourceContractA = cursorQuery.moveToFirst() ? a(cursorQuery, false) : null;
                cursorQuery.close();
            }
        }
        return resourceContractA;
    }

    public ArrayList<ResourceContract> a(String str) {
        Cursor cursorQuery;
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (str != null && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=?", new String[]{str}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(a(cursorQuery, false));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(ResourceContract resourceContract) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("formId", resourceContract.getFormId());
        contentValues.put("remoteUrl", l3.a(resourceContract.getRemoteUrl(), true));
        contentValues.put("localUrl", l3.a(resourceContract.getLocalUrl(), true));
        contentValues.put("checksum", resourceContract.getChecksum());
        contentValues.put("isGlobal", Integer.valueOf(resourceContract.isGlobal().booleanValue() ? 1 : 0));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16583a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(ResourceContract resourceContract) {
        String[] strArr;
        String str;
        String str2;
        boolean z = true;
        if (resourceContract == null) {
            str2 = "delete (invalid data) - record is null";
        } else {
            if (resourceContract.isGlobal().booleanValue()) {
                strArr = new String[]{l3.a(resourceContract.getRemoteUrl(), true)};
                str = "isGlobal=1 AND remoteUrl=?";
            } else if (TextUtils.isEmpty(resourceContract.getFormId())) {
                str2 = "delete (invalid data) formId is not valid";
            } else {
                strArr = new String[]{resourceContract.getFormId(), l3.a(resourceContract.getRemoteUrl(), true)};
                str = "formId=? AND remoteUrl=?";
            }
            z = f1.a().getWritableDatabase().delete(d(), str, strArr) > 0;
            z = !z;
            str2 = "delete - " + resourceContract;
        }
        a(z, str2);
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(ResourceContract resourceContract) {
        if (!TextUtils.isEmpty(resourceContract.getFormId()) && !TextUtils.isEmpty(resourceContract.getRemoteUrl()) && !TextUtils.isEmpty(resourceContract.getLocalUrl())) {
            return super.c((l6) resourceContract);
        }
        a(true, "insert (invalid data from collector) - " + resourceContract);
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(ResourceContract resourceContract) {
        return f1.a().getWritableDatabase().update(d(), b(resourceContract), "remoteUrl=? AND localUrl=?".concat(TextUtils.isEmpty(resourceContract.getFormId()) ? "" : " AND formId=?"), TextUtils.isEmpty(resourceContract.getFormId()) ? new String[]{l3.a(resourceContract.getRemoteUrl(), true), l3.a(resourceContract.getLocalUrl(), true)} : new String[]{l3.a(resourceContract.getRemoteUrl(), true), l3.a(resourceContract.getLocalUrl(), true), resourceContract.getFormId()}) > 0 || super.c((l6) resourceContract);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof Boolean)) {
            if (f1.a().getWritableDatabase().delete(d(), "isGlobal=?", new String[]{String.valueOf(((Boolean) obj).booleanValue() ? 1 : 0)}) > 0) {
                return true;
            }
        }
        return false;
    }
}
