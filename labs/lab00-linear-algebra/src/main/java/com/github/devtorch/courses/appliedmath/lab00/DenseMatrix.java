package com.github.devtorch.courses.appliedmath.lab00;

public record DenseMatrix(double[][] a) implements Matrix {

    @Override
    public int rows() {
        return 0;
    }

    @Override
    public int cols() {
        return 0;
    }

    @Override
    public double at(int r, int c) {
        return 0;
    }

    @Override
    public Vector mul(Vector v) {
        return null;
    }

    @Override
    public Matrix add(Matrix other) {
        return null;
    }

    @Override
    public Matrix T() {
        return null;
    }
}
