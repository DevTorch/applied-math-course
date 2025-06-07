package com.github.devtorch.courses.appliedmath.lab00;

/**
 * Базовый интерфейс квадратной/прямоугольной матрицы.
 * Только методы, которые пригодятся дальше (PageRank, SVD не требуется).
 */
public interface Matrix {

    int rows();

    int cols();

    double at(int r, int c);

    /**
     * this·v  (умножаем на столбец-вектор)
     */
    Vector mul(Vector v);

    /**
     * this + other
     */
    Matrix add(Matrix other);

    /**
     * transposed(this)
     */
    Matrix T();

    /**
     * Единичная матрица размерности n
     */
    static Matrix eye(int n) {
        double[][] d = new double[n][n];
        for (int i = 0; i < n; i++) d[i][i] = 1.0;
        return new DenseMatrix(d);
    }
}
