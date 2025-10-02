package com.adobe.marketing.mobile.services;

/* loaded from: classes.dex */
public interface DataQueue {
    boolean a(DataEntity dataEntity);

    boolean clear();

    void close();

    DataEntity peek();

    boolean remove();
}
