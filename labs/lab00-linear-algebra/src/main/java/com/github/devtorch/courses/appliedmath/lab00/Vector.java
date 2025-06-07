package com.github.devtorch.courses.appliedmath.lab00;

/**
 * Небольшой immutable-вектор двойной точности.
 * Все методы бросают IllegalArgumentException,
 * если размерности не совпадают.
 */
public interface Vector {

    /** @return количество координат (n) */
    int length();

    /** @return v[i] */
    double at(int i);

    /** Скалярное произведение this·other */
    double dot(Vector other);

    /** this + other */
    Vector add(Vector other);

    /** this − other */
    Vector sub(Vector other);

    /** λ·this */
    Vector scale(double lambda);

    /** ||this||₂ */
    double norm();

    /** Копия в виде массива */
    double[] toArray();

    /* ---------- статический фабричный метод ---------- */

    static Vector of(double... data) {
        return new DenseVector(data.clone());
    }
}
