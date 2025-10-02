package io.reactivex.observers;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.BaseTestConsumer;

/* loaded from: classes7.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TestWaitStrategy implements Runnable {
        public static final /* synthetic */ TestWaitStrategy[] d = {new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // java.lang.Runnable
            public final void run() {
                Thread.yield();
            }
        }, new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new TestWaitStrategy() { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }};

        /* JADX INFO: Fake field, exist only in values array */
        TestWaitStrategy EF2;

        public static TestWaitStrategy valueOf(String str) {
            return (TestWaitStrategy) Enum.valueOf(TestWaitStrategy.class, str);
        }

        public static TestWaitStrategy[] values() {
            return (TestWaitStrategy[]) d.clone();
        }
    }
}
