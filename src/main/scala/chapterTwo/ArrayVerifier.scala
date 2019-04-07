package chapterTwo

object ArrayVerifier {
  @annotation.tailrec
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = as match {
    case as if (as.isEmpty) => true
    case as if (as.length == 1) => true
    case as if (!ordered(as(0), as(1))) => false
    case as => isSorted(as.drop(1), ordered)
  }

}
