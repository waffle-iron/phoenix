/*
 * Copyright (c) 2016 Sandia Corporation. All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by the
 * terms of this license.
 * You must not remove this notice, or any other, from this software.
 *
 * Contributors:
 * - Mark Bastian: Original author.
 * - See Git logs.
 */

package gov.sandia.phoenix.numerics

import org.scalatest.FunSuite

class OptimizationTest extends FunSuite
{
  test("goldenMax") {
    def f(t : Double) = - t * t - 5.0
    val max = optimization.goldenMax(-5.0, 5.0, 1E-3)(f)
    assert(max._2 == -5.0)
  }
      
  test("goldenMin") {
    def f(t : Double) = t * t - 5.0
    val max = optimization.goldenMin(-5.0, 5.0, 1E-3)(f)
    assert(max._2 == -5.0)
  }
}